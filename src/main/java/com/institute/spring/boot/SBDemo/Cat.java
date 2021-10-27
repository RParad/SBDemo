package com.institute.spring.boot.SBDemo;

public class Cat {

    private String name;
    private int age;
    private String breed;

    public Cat(String name,int age, String breed){
            this.name = name;
            this.age = age;
            this.breed = breed;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public String getJsonObjectOfCat(){
            return "{"+
                    "\"name\" : \" " + name + "\"," +
                    "\" age\" : \" " + age + "\"" +
                    "}";
    }
}
