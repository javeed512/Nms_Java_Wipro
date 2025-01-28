flowers[0]="Rose";
flowers[1]="Lily";
flowers[2]="Mogra";
flowers[3]="Lotus";


echo  ${flowers[*]};
i=0;
while [  $i -lt 4 ]
do
	 
	echo ${flowers[$i]}
	 
	let i=$i+1;
	 
done
