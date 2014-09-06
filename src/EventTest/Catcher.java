/*_______________________________________________________________________License
	Copyright © 2014 Roy Pfund

	Licensed under the Apache License, Version 2.0 (the  "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable  law  or  agreed  to  in  writing,
	software distributed under the License is distributed on an  "AS
	IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,  either
	express or implied. See the License for  the  specific  language
	governing permissions and limitations under the License.
____________________________________________________________*/package EventTest;
//Creating and using Your own custom events in Java.

//2 Things needed in a class file to receive events from a class:
/*_______________________________________________________________*/class Catcher
implements ThrowListener {//implement added to class
//Set of @Override functions that Catch Events
	@Override public void Catch() {
		System.out.println("I caught something!!");
	}
////Optional: 2 things to receive events from a class that is a member of the current class
////instantiation of a thrower object
//	static Thrower ThrowerInstance = new Thrower();
//	public Catcher(){
////use of thrower object's addListener function
//		ThrowerInstance.addThrowListener(this);
//		ThrowerInstance.Throw();//let's trigger an event to see if it works!
//	}
//	public static void main(String[] args) {
//		new Catcher();
//	}
}
