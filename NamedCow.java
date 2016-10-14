class NamedCow extends Cow
{
	private String[] myName = new String[4];
	public NamedCow(String type, String sound, String name1, String name2, String name3, String name4)
	{
		myType = "Cow";
		mySound = "Moo";
		myName[0] = name1;
		myName[1] = name2;
		myName[2] = name3;
		myName[3] = name4;
		}
	public NamedCow()
	{
		myType = "unknown";
		mySound = "unknown";
		myName[0] = "unknown";
		myName[1] = "unknown";
		myName[2] = "unknown";
		myName[3] = "unknown";
	}
	public String getName()
	{
		String cowName;
          int random = (int)(Math.random()*4);
          cowName = myName[random];
          return cowName;

	}

	public String getType(){return myType;}
}