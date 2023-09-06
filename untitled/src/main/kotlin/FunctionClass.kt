class FunctionClass {

	fun welcome(){
		//println("Welcome to the Kotlin Learning Course")
	}
	fun gratingBirthday(from:String,to:String){
		//println("Happy Birthday $from to $to")
	}
	fun  calculateAge(num1:Int,num2:Int):Int{
		return  num1+num2
	}
	fun  isComing():Boolean{
		return false;
	}
	fun comeAnyValue(anyValue:Any):Any{
		return  anyValue
	}
	//OVERLOADING
	//METHOD OVERLOADING DEPENDS ON
	// 1-> TYPE OF PARAM
	// 2-> NUMBER OF PARAM
	fun DisplayNumber(value:Int){
		//println("You Enter $value")
	}
	fun DisplayNumber(value:String){
		//SAME NAME BUT ARG TYPE DIFF
		//println("You Enter $value")
	}
	fun DisplayNumber(value: Int,value2: Int){
		//SAME NAME BUT ARG NO DIFF
		//println("You enter $value and $value2")
	}


}