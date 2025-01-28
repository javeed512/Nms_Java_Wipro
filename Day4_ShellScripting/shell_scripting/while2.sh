while  echo "Enter  Eid "
	 
do
	 
	read  eid
	 
	 
	case "$eid"  in
		 
		[0-9][0-9][0-9])  grep  "^$eid"  emp.lst ;;
		0) exit ;;
		*)  echo  "employee Eid:   $eid  not found"  ;;
		 
		 
	esac
	 
done
