public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    public Animal (string family , string name , int age , boolean isMammal){
        this.family=family ;
        this.name=name ;
        this.age=age ;
        this.isMammal =isMammal ;
    }
    public void displayAnimal() {
        System.out.println("famille  : " + family);
        System.out.println("nom : " + name);
        System.out.println("age : " + age);
        System.out.println("isMammal : "+isMammal);
    }
    public String toString() {
        return "Animal{famille:"+family +" nom="+ name + "age="+ age+ "isMammal=" + isMammal + "}";
    }
}
public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    public Zoo (string name , string city , int nbrCages) {
        animals=newAnimal[25];
        this.name=name ;
        this.city=city ;
        this.nbrCages=nbrCages;
    }
    public void displayZoo() {
        System.out.println("Nom  : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }
    public String toString() {
        return "Zoo{nom =" + name + " city :" + city + " Nombre de cages :" + nbrCages + "}";
    }

}

public class Creation_Objets {
    public static void main(String[] args) {
        Animal lion =new Animal("abvdzsdf", "lionnea", 7, true);
        Zoo myZoo = new Zoo("Belvédère", "Tunis", 25);

        System.out.println("informations sur le lion :");
        System.out.println(" famille  :" + lion.family +"name:" +lion.name +"age :" + lion.age +"isMammal : " +lion.isMammal);
        System.out.println("informations sur le zoo:");
        System.out.println("name :"+Zoo.name +"city :" +Zoo.city +"nbrCages :" Zoo.nbrCages);
    }
}
public class Creation_Zoo {
    public static void main(String[] args) {
        
        Zoo myZoo = new Zoo("Belvédère", "Tunis", 25);
        Animal lion =new Animal("abvdzsdf", "lionne", 7, true);
        Animal Chat =new Animal("chatd", "chatte", 1, true);
        Animal Chien =new Animal("qsdfgh", "chienne",4, true);
        Animal Serpent =new Animal("rgfvdcw", "serpentine", 1, true);

        myZoo.Animals[0]=Lion ;
        myZoo.Animals[1]=Chat ;
        myZoo.Animals[2]=Chien ;
        myZoo.Animals[3]=Serpent ;

    
        System.out.println( myZoo.name + " situé à" + myZoo.city + "et contient  " + myZoo.nbrCages + " cages.");

            for (Animal  : myZoo.animals) {
                if (animal != null) {
                    System.out.println( + animal.name + "de la Famille : " + animal.family + " Âge : " + animal.age + "isMammal : " + animal.isMammal);
                }
            }
        }    
        //avec l'instruction 8 /9
        myZoo.displayZoo();
        lion.displayAnimal();
        chat.displayAnimal();
        chien.displayAnimal();
        serpent.displayAnimal();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
    }

    




   




