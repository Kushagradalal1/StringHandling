public class ExTwo
{
	public static void main(String args[]){
		int count=0;

		String str="the said,'The mailmain loves you.'I heard it with my own ears.";

		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='!' || str.charAt(i)==',' || str.charAt(i) =='.' || str.charAt(i)=='-'){

				count++;

			}
		}
		System.out.println("Total number of Punctuation is : "+count);
	}

}