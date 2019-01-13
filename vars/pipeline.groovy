
import com.cleverbuilder.pipline
 //  println GlobalVars.foo
 // instantiate
//def call(){ 
pl = new pipline()
// work
stage ('1'){
pl.build()
//assert pl.deploy ('qa','api')
//pl.deploy ('qa','api')
 pl.test (${name})
//pl.deploy('staging','api')
//pl.test('load')
//pl.deploy('prod','api')
//pl.test('Marge')                         
//assert 'WonderMarge' ==  pl.test()
//sayHello('alaa')
 // pipline(name: 'alaa')  
}
//}
