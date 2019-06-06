This is the resource server, there are  couple of resources which are allowed to  users with different roles.  

@GetMapping("/admins")
@PreAuthorize("hasAuthority('role_admin')") 
To access this resource, a  access token for admin roles must be created from the Auth server.

@GetMapping("/users")
@PreAuthorize("hasAnyAuthority('role_admin','role_user')")
To access this resource an access token either with admin or user roles must be created from the Auth server.
	  
@GetMapping("/common") 
No PreAuthorize is defined so no access token needed to access this resource.

@GetMapping("/getevents")
@PreAuthorize("hasAuthority('role_apiuser')")
To access this recource an access token for apiuser must be created first.

To run the application the resource server should be running and should genetare valid access token for different users.
The access url of the application are 
http://localhost:8080/common
No token needed.  

http://localhost:8080/admins     with valid access_token for admin users as request header.
Key : Authorization    Value: Bearer {admin user access_token}

http://localhost:8080/admins     with valid access_token for apiuser users as request header.
Key : Authorization    Value: Bearer {apiuser user access_token}


