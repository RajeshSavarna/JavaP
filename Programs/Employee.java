/*
In an organization TCS number of employees join each year. 
In the same way a number of employees leave the organization each year. 
Given all this data of the organization, write a program that will calculate:

The total number of employees who have worked for the organization
The number of employees who are currently working in the organization

Input Specification: 
Input Will contain number of lines, 
each line containing the employee id of the associate who has joined or left the company.
'+' symbol is used to indicate that the employee has joined the organization 
and '-' sign is used to indicate that the employee has left the organization. 
Your program should stop taking the input as soon as it encounters 0

Output Specification: 
Output will contain n+2 lines with first line specifying the total number of employees worked 
for the organization and the second line specifies the number of employees currently working in the organization. 
The following n lines specify the employee id of each employee who is working in the organization currently. 
Your program should print the employee ids in the order of their entry into the organization.

Sample Input : 
+3421
+3423
+3532
-3423
+3353
-3353
+7564
+9707
-3532
0
Sample Output : 
6
3
3421
7564
9707
*/

