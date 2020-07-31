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
B. Model fish as well as other swimming animals
1. In addition to the birds, can you model a fish? done
a. Fishes don’t sing
b. Fishes don’t walk
c. Fishes can swim
2. Can you specialize the fish as a Shark and as a Clownfish? done
a. Sharks are large and grey
b. Clownfish are small and colourful (orange)
c. Clownfish make jokes
d. Sharks eat other fish
3. Dolphins are not exactly fish, yet, they are good swimmers
a. Can you model a dolphin that swims without inheriting from a fish class? inherited animal and implemented AquaticAnimals
b. How do you avoid duplicating code or introducing unneeded overhead? made use of default method feature available in java8
D. Model animals that change their behaviour over time
1. Can you model a butterfly? done
a. A butterfly can fly
b. A butterfly does not make a sound

2. Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly? done using Egg as base class with getState method having different stages larva and pupa
a. A caterpillar cannot fly
b. A caterpillar can walk (crawl)
