add()
{
	 
	a=$1
	 
	b=$2
	 
	 
	echo   $(($a + $b))
	 
	 
	return $(($a + $b))
	 
	 
}
echo  "Result:  `add $@`  "


