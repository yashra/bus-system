function Submit(){
 var RegEx=/^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
 var fname = document.form.Ftxt.value,
  lname = document.form.Ltxt.value,
  femail = document.form.Etxt.value,
  fpassword = document.form.Ptxt.value,
  Cpassword = document.form.CPtxt.value,
  fuser = document.form.Utxt.value,
  fgender = document.form.Gender.value;
  
  
  if (fuser == "") {
        document.form.Utxt.focus();
  document.getElementById("errorBox").innerHTML = "Enter the username";
        return false;
     }
	
  if(fpassword == "")
  {
   document.form.Ptxt.focus();
   document.getElementById("errorBox").innerHTML = "Enter the password";
   return false;
  }

   if(Cpassword == "")
  {
   document.form.CPtxt.focus();
   document.getElementById("errorBox").innerHTML = "Re-enter the password";
   return false;
  }
  
  if(Cpassword !=  fpassword){
   document.form.CPtxt.focus();
   document.getElementById("errorBox").innerHTML = "Password are not matching, re-enter again";
   return false;
   }
   
   if (femail == "" )
 {
  document.form.Etxt.focus();
  document.getElementById("errorBox").innerHTML = "Enter the email";
  return false;
  }else if(!RegEx.test(femail)){
  document.form.Email.focus();
  document.getElementById("errorBox").innerHTML = "Enter the valid email";
  return false;
  }  
   
 if( fname == "" )
   {
     document.form.Ftxt.focus() ;
  document.getElementById("errorBox").innerHTML = "Enter the first name";
     return false;
   }
 if( lname == "" )
   {
     document.form.Ltxt.focus() ;
   document.getElementById("errorBox").innerHTML = "Enter the last name";
     return false;
   }
   
  if (fgender == "") {
        document.form.Gender.focus();
  document.getElementById("errorBox").innerHTML = "Select the gender";
        return false;
     }
  
  if(fuser != '' && fpassword != '' && Cpassword != '' && femail != '' && fname != '' && lname != '' && fgender != '' ){
   window.location.href='submit.html';
   return false;
   }
     
}
function def()
{
var c=confirm("Do you want cancel form");
if(c==true)
{
	window.location.href='cancel.html';
return false;
}
else{
	
return true;
}
}
