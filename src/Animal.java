class Animal {
    private String species;
    private String name;

    Animal(String species, String name) {
        this.species = species;
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
