# singtel_assignment
1. Can you implement the sing() method for the bird? done
a. How did you unit test it? by changing return type to string
b. How did you optimize the code for maintainability? using constants wherever possible
(Ask yourself the same question for all following exercises)
2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?
a. A duck says: “Quack, quack” done
b. A duck can swim done
c. A chicken says: “Cluck, cluck” done
d. A chicken cannot fly (assumption: its wings are clipped but ignore that) done
3. Now how would you model a rooster?
a. A rooster says: “Cock-a-doodle-doo” done
b. How is the rooster related to the chicken? rooster can be sub class of chicken
c. Can you think of other ways to model a rooster without using inheritance? designed rooster as subclass of bird instead of chicken
4. Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster.  done
a. A parrot living with dogs says: “Woof, woof”
b. A parrot living with cats says: “Meow”
c. A parrot living near the rooster says: “Cock-a-doodle-doo”
d. How do you keep the parrot maintainable? What if we need another parrot
lives near a Duck? Or near a phone that rings frequently? the sound is maintained in property file. Parrot sing method takes animal name is param and appropriate sound is called from application.properties
