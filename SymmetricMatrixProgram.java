import java.util.Scanner;
public class SymmetricMatrixProgram
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter_the_no_of_rows_:_");
int rows=sc.nextInt();
System.out.println("Enter_the_no_of_columns_:_");
int cols=sc.nextInt();
int matrix[][]=new int[rows][cols];
System.out.println("Enter_the_elements_:");
for(int i=0;i<rows;i++)
for(int j=0;j<cols;j++)
matrix[i][j]=sc.nextInt();
sc.close();
System.out.println("Printing-the_input_matrix_:");
for(int i=0;i<rows;i++)
{
for(int j=0;j<cols;j++)
System.out.print(matrix[i][j]+"\t");
System.out.println();
}
if(rows!=cols)
System.out.println("The_given_matrix_is_not_a_square_matrix.");
else
{
boolean symmetric=true;
for(int i=0;i<rows;i++)
for(int j=0;j<cols;j++)
if(matrix[i][j]!=matrix[j][i])
{
symmetric=false;
break;
}
if(symmetric)
{
System.out.println("The given_matrix_is_symmetric....");
}
else
{
	System.out.println("The_given_matrix_is_not_symmetric....");
	
}
}
}
}
