### GET
 URL | Descripcion
 -----|------------
/api/{userName}/reciclados | Obtiene la lista de reciclados de un usuario.
/api/{userName}/totalreciclado | Obtiene el totalreciclado de un usuario.
/api/usuarios/{userName} | Obtiene un usuario especifico.

### POST
URL: /api/usuarios <br />
DESCRIPCIÓN: Agrega un nuevo usuario. <br />
HEADER:"Content-Type : application/json" <br />
BODY: <br />
```json
{
	"firstName":"ExampleFirstName",
	"lastName":"ExampleLastName",
	"userName":"user",
	"address":"ExampleAddress",
	"mail":"Example@mail.com"
}
```
URL: /api/reciclados <br />
DESCRIPCIÓN: Agrega un nuevo reciclado a un user indicado en el body. <br />
HEADER:"Content-Type : application/json" <br />
BODY: <br />
```json
{	
	"userName":"user",
	"bottles":"1",
	"tetrabriks":"2",
	"glass":"3",
	"paperboard":"4",
	"cans":"5"
}
```
