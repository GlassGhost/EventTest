/*	Copyright © 2014 Roy Pfund

	Licensed under the Apache License, Version 2.0 (the  "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable  law  or  agreed  to  in  writing,
	software distributed under the License is distributed on an  "AS
	IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,  either
	express or implied. See the License for  the  specific  language
	governing permissions and limitations under the License.
*/
package EventTest;
/* 
Creating and using Your own custom events in Java.

3 Things needed on catching side:
*/
class Catcher implements ThrowListener {//implement added to class
	//an override of 1 events that can caught by this type of catcher
	@Override public void Catch() {
		System.out.println("I caught something!!");
	}

	static Thrower ThrowerInstance = new Thrower();
	public Catcher(){
		//instantiation of a thrower object and use of it's addListener function
		ThrowerInstance.addThrowListener(this);
	}

	public static void main(String[] args) {
		new Catcher();
		ThrowerInstance.Throw();
	}
}
