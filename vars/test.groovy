#!/usr/bin/groovy

def test1(name) {
  echo "Hello.${name}"
}
def build() {
  // mvn clean deploy -U
  echo 'build'
}
def test(name) {
  // sh "/usr/local/bin/${name}"
  echo "/usr/local/bin/${name}"
}
def deploy(env,app) {
 // aws cloudformation create-stack \
  //--stack-name ${env}_{app)
  //--parameters \
    //ParameterKey=Env,ParameterValue=${env}
  //...(rest of the params go here)
  echo "stack-name ${env}_${app)"
}
def call(String name = 'human') {
  echo "Hello, ${name}."
}
