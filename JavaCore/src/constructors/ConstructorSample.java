package constructors;

public class ConstructorSample
{
	    private String name;
	    private String pathway;
	    private boolean hired = false;

	    public ConstructorSample(String name, String pathway)
	    {
	        this.name = name;
	        this.pathway = pathway;
	    }

	    public ConstructorSample(String name, String pathway, boolean hired)
	    {
	        this.name = name;
	        this.pathway = pathway;
	        this.hired = hired;
	    }
}


