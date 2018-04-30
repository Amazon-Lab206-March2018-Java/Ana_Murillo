class ProjectTest {
    public static void main(String[] args) {

        Project newProject = new Project();
        Project firstProject = new Project("first project");
        firstProject.setDescription("this is my first description");

        Project thirdProject = new Project("third Project","this is my other description");
        
        System.out.println(firstProject.elevatorPitch());
        System.out.println(thirdProject.elevatorPitch());
        System.out.println(newProject.elevatorPitch());
    }
}
