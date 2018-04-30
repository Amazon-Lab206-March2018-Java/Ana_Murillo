class Project {
    private String name;
    private String description;
    
    public Project() {
        this.name = "project name";
        this.description = "project description";
    }

    public Project(String name) {
        this.name = name;
        this.description = "project description";

    }

    public Project(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String elevatorPitch(){
        return name + ":" + description;
    }

    //getter
    public String getName(){
        return name;
    }
    //setter
    public void setname(String name){
        this.name = name;
    }
    //getter
    public String getDescription(){
        return description;
    }
    //setter
    public void setDescription(String description) {
        this.description = description;
    }
    
}
