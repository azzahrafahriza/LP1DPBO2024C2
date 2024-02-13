<?php

class Crud
{
	private $listHuman = array();
	
	public function __construct(){
		$indeks = 0;
	}
	public function tambah($id,$name,$bidang,$partai,$foto){
		$temp = new Human($id,$name,$bidang,$partai,$foto);
		$this->listHuman[]=$temp;
	}
	
	public function tampil(){
		// echo endl;
		if(sizeof($this->listHuman)==0){
			echo "Data tidak ada";
		}else{
			echo "<table border = '1'>";
			
			echo "<tr>";
			echo "<td> Id </td>";
			echo "<td> Name </td>";
			echo "<td> Bidang </td>";
			echo "<td> Partai </td>";
			echo "<td> Foto </td>";
			echo "</tr>";
			
			foreach ($this->listHuman as $Human) {
				echo "<tr>";
				echo "<td>" .  $Human->getId() . "</td>";
				echo "<td>" .  $Human->getName() . "</td>";
				echo "<td>" .  $Human->getBidang() . "</td>";
				echo "<td>" .  $Human->getPartai() . "</td>";
				echo "<td><img src=\"".  $Human->getFoto() . "\" width='100px' /></td>";
				echo "</tr>";
			}
			echo "</table>";
		}
	}
};
?>