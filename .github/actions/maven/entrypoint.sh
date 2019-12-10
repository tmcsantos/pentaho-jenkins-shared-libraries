#!/usr/bin/env sh
set -e

# If in a github action, change the maven configuration directory to the github's working space
# to be able to use action/cache for dependency caching
if [ -n "${GITHUB_WORKSPACE}" ]; then
  export MAVEN_CONFIG="${GITHUB_WORKSPACE}/.m2"
fi

# The MAVEN_CONFIG could have been configured (default is $HOME/.m2), we want to make sure we are using the right
# user home or we could risk not using any custom settings.
# Configure the user.home
export MAVEN_OPTS="$MAVEN_OPTS -Duser.home=${MAVEN_CONFIG%%/.m2}"

exec /usr/local/bin/mvn-entrypoint.sh $@
