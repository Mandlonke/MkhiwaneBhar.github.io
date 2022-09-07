/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.arrays;

/**
 *
 * @author Bhar
 */
public class FINALARRAYS {

   public void insertionSort(int[] list, int listLength)
{
int i, location;
int temp;
for (i = 1; i < listLength; i++)
if (list[i] < list[i - 1])
{
temp = list[i];
location = i;
do
{
list[location] = list[location - 1];
location--;
}
while(location > 0 && list[location - 1] > temp);
list[location] = temp;
       
    }
    

