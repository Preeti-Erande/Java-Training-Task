package StringOperations;

public class MainClass {

	public static void main(String[] args) 
	{
		Operations obj = new Operations();
		obj.FindLength();
		obj.PrintLongestString("Welcome", "Welcome to Testing");
		obj.Compare();
		obj.VerifyContains();
		obj.VerifyContainsIgnoreCase();
		obj.FindIndex();
		obj.FindString();
		obj.FindFileExtension("Tax return.pdf"); //pdf
		obj.FindFileExtension("Tax return of 2021.pdf"); // pdf
		obj.SplitString();
		obj.FindCountOfCharacter();
		obj.CountCharacterUsingSplit();
	 
	

	}

}
