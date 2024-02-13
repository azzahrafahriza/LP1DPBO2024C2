<?php
require('Human.php');
require('Crud.php');

$newCrud = new Crud();
$newCrud->tambah('2102296','Azzahra','Ilkom','Depilkom','https://asset-2.tstatic.net/banten/foto/bank/images/Zoro-One-Piece-faefwef.jpg');
$newCrud->tambah('2102297','Fahriza','Ilkom','Depilkom','https://i.pinimg.com/originals/df/81/c9/df81c91f15e8280e24af32e316404b2e.png');
$newCrud->tampil();

?>