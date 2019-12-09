# Pentaho Maven docker action

A maven action with settings for Pentaho artifact resolution. 

## Inputs

### `args`

**Required** The maven goal(s) and options to execute.

## Example usage

uses: tmcsantos/pentaho-jenkins-shared-libraries/.github/actions/maven@master
with:
  args: '-v'