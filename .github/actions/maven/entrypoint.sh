#!/usr/bin/env sh
set -eu

export MAVEN_CONFIG="${GITHUB_WORKSPACE:-$MAVEN_CONFIG}/.m2" # to be able to cache dependencies

exec /usr/local/bin/mvn-entrypoint.sh $@
