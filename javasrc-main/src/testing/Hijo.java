package testing;

class Hijo extends Padre{
	/*
	 * si esta private, se debe acceder a el con get ó set
	 * private String name_variable_hijo = "Samuel";
	 */
    protected String name_variable_hijo = "Samuel";

    public void setName_variable_hijo(String name_variable_hijo){
        this.name_variable_hijo = name_variable_hijo;
    }

    public String getName_variable_hijo(){
        return name_variable_hijo;
    }

}