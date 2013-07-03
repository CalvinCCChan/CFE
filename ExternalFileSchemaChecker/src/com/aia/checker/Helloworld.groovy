package com.aia.checker

class Helloworld {
	def printHelloWorld(){
		print 'Hello world'
	}	
	
	def int repeatAdd(val=5){
		def returnValue = 0
		for(i in 1..val)
			returnValue += i
			
		return returnValue
	}
}
