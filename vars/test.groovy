//src/io/abc/pipeline.groovy
//#!/usr/bin/groovy
//package io.abc;
def build() {
  // mvn clean deploy -U
  echo 'build'
}
def test(name) {
  // sh "/usr/local/bin/${name}"
  echo '/usr/local/bin/${name}'
}
def deploy(env,app) {
 // aws cloudformation create-stack \
  //--stack-name ${env}_{app)
  //--parameters \
    //ParameterKey=Env,ParameterValue=${env}
  //...(rest of the params go here)
  echo 'stack-name ${env}_{app)'
}
def call() {
  echo "Hello."
}
// AimTheory have a recommendation and explanation about this here
return this
