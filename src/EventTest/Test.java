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

/*________________________________________________________________*/class Test {
	public static void main(String[] args) {
		Asynch Catcher1 = new Asynch();
		Asynch Catcher2 = new Asynch();
		Catcher1.addThrowListener(Catcher2);
		Catcher2.addThrowListener(Catcher1);

		System.out.println("Catcher1 throw something");
		Catcher1.Throw();
		System.out.println("Catcher2 throw it back");
		Catcher2.Throw();
	}
}

