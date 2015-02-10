EventTest
=========

EventTest is a [APACHE Licensed] Event Throwing example [Java] Program. It is also an example of the [Apache Ant] build system.

Build Instructions
------------------
To git clone AND build AND run on a Debian(or Ubuntu) machine simply run the following:
```
sudo apt-get install -y ant default-jdk git build-essential
git clone https://github.com/GlassGhost/EventTest
cd ./EventTest
ant
java -jar './EventTest.jar'
```

___________________________
# How to Use Events In Java

There are 3 different ways you may wish to set this up:

 1. `Thrower` inside of `Catcher`
 2. `Catcher` inside of `Thrower`
 3. `Thrower` and `Catcher` inside of yet another class in this example `Test`

**This Example Project** Defaults to Option 3, to try the others simply uncomment the "`Optional`" code block of the class you want to be main, and set that class as the `${Main-Class}` variable in the `build.xml` file:

That being said
**4 Things needed on throwing side code:**

    import java.util.*;//import of java.util.event
    
    //Declaration of the event's interface type, OR import of the interface,
    //OR declared somewhere else in the package
    interface ThrowListener {
    	public void Catch();
    }
    /*_____________________________________________________________*/class Thrower {
    //list of catchers & corresponding function to add/remove them in the list
    	List<ThrowListener> listeners = new ArrayList<ThrowListener>();
    	public void addThrowListener(ThrowListener toAdd){ listeners.add(toAdd); }
    	//Set of functions that Throw Events.
    		public void Throw(){ for (ThrowListener hl : listeners) hl.Catch();
    			System.out.println("Something thrown");
    		}
    ////Optional: 2 things to send events to a class that is a member of the current class
    . . . go to Thrower.java file see this code . . .
    }

----------
**2 Things needed in a class file to receive events from a class**

    /*_______________________________________________________________*/class Catcher
    implements ThrowListener {//implement added to class
    //Set of @Override functions that Catch Events
    	@Override public void Catch() {
    		System.out.println("I caught something!!");
    	}
    ////Optional: 2 things to receive events from a class that is a member of the current class
    . . . go to Catcher.java file see this code . . .
    }

[APACHE Licensed]:http://www.apache.org/licenses/LICENSE-2.0
[Java]:https://en.wikipedia.org/wiki/Java_(programming_language)
[Apache Ant]:https://en.wikipedia.org/wiki/Apache_Ant


  [1]: https://github.com/GlassGhost/EventTest#hexed
