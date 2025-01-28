echo "Enter your choice"
 
read  choice
 
case  $choice in
	1)  ls -l   ;;
	2)  ps -f  ;;
	3)  date ;;
	4) whoami ;;
	5)  exit ;;
	*)  echo "invalid option , enter valid option";;
esac

