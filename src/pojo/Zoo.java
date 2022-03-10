package pojo;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal animal = new Animal(" African Grey Parrot", "bird", 60 , "Raphia Palms", true, "Omnivore");
		
Animal animal2 = new Animal(" Barred Owl", "bird", 20 , "Raphia Palms", false, "Carnivore");

Animal animal3 = new Animal(" Red Panda", "mammal", 13 , "Southern China", true, "herbivore");

Animal animal4 = new Animal(" North American River Otter", "mammal", 20 , "marine coast", false, "Carnivore");

Animal animal5 = new Animal(" Vietnames walking Stick", "insect", 1 , "tropical forest", false, "herbivore");


		animal.print();
		animal2.print();
		animal3.print();
		animal4.print();
		animal5.print();
	}

}
