#!/usr/bin/env sh
set -e

if [ -n "${GITHUB_WORKSPACE}" ]; then
  export MAVEN_CONFIG="${GITHUB_WORKSPACE}/.m2" # to be able to cache dependencies
fi

# Configure user home
export MAVEN_OPTS="$MAVEN_OPTS -Duser.home=${MAVEN_CONFIG%%/.m2}"

exec /usr/local/bin/mvn-entrypoint.sh $@
