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

5 Things needed on throwing side:
*/
import java.util.*;//import of java.util.event

interface ThrowListener {//a declaration of the events that can caught by a catcher
	public void Catch();
}

class Thrower {
	//list of catchers & corresponding function to add them to the list
	List<ThrowListener> listeners = new ArrayList<ThrowListener>();
	public void addThrowListener(ThrowListener toAdd){ listeners.add(toAdd); }

	public void Throw() {
		System.out.println("Something thrown");

		//1 or more times, a Notification that an event happened is thrown.
		for (ThrowListener hl : listeners) hl.Catch();
	}
}
