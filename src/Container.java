public class Container {
int data[];
int length;
Container(){
	length=0;
	data=null;
}
Container(int length){
	assert(length>=0);
	this.length=length;
	if(length>0)
		data=new int [length];
	else
		data=null;
}
public int GetValue(int index) {
	return data[index];
}
public int GetLength()
{
	return length;
}
public void Insert(int elem, int index) {
	assert(index >= 0 && index < length);
	int new_data[] = new int[length + 1];
	for (int before = 0; before < index; before++)
		new_data[before] = data[before];
	new_data[index] = elem;
	for (int after = index; after < length; after++)
		new_data[after + 1] = data[after];
	data = new_data;
	length++;
}
public void Remove(int index) {
	assert(index >= 0 && index < length);
	if (length == 1)
	{
		data = null;
		length = 0;
		return;
	}
	int new_data[] = new int[length - 1];
	for (int before = 0; before < index; before++)
		new_data[before] = data[before];
	for (int after = index + 1; after < length; after++)
		new_data[after - 1] = data[after];
	data = new_data;
	length--;
}
public void Output()
{
	for(int index=0;index<length;index++)
		System.out.print(data[index]);
	    System.out.print(' ');
}
}
