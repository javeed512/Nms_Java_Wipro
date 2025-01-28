echo  "Enter any number GT 3"
read   num
 
while [ $num -gt  3 ]
	 
	  do
		   ps  -a
		        
		 sleep  5

          let  num=$num-1

done
		    
