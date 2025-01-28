echo "Enter a value"
read  a

echo "Enter b value"
read  b

echo  "Enter c  value"
read  c

if  [ $a  -gt $b ];  then
	echo "a is greater than b"

elif  [ $a  -gt  $c ]; then
	echo "a is greater than c"

else  
	echo "a is not greater than b and c"

fi	



