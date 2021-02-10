<?php  

	$name = $POST['name'];
	$email = $POST['email'];
	$password = $POST['password'];

	if(!empty($name) || !empty($email) || !empty($password))
	{
		$host = "localhost";  
		$dbusername = "root";  
		$dbpassword = ""; 
		$dbname = "oop";
		//creating connection
		$conn = new mysqli($host , $dbusername , $dbpassword);  
		if(mysqli_connect_error())
		{die('Connect Error('.msqli_connect_errno().')');}
		else
		{
			$SELECT = "SELECT email fron sign_up where email = ? Limit 1";
			$INSERT = "INSERT into sign_uo (name,email,password) values (?,?,?);"
			
			// preparing statement
			$stmt = $conn->prepare($SELECT);
			$stmt->bind_param("s",$email);
			$stmt->execute();
			$stmt->bind_result($email);
			$stmt->store_result();
			$rnum = $stmt->num_rows;
				if($rnum==0)
				{	
					$stmt->close();
					$stmt = $conn->prepare($INSERT);
					$stmt->bind_param("sss",$name,$email,$password);
					$stmt->execute();
					echo "New record inserted successfully"					
				}
				else {		echo "Someone has used this email kindly try another one..";	}
				$stmt->close();
				$conn->close();

		}
		
		$sql = mysql_select_db ('oop',$conn) or die("unable to connect to database"); 
	} 

	else
	{echo "All fields are requied please fill the form again";
	die();}
	
 
?> 
