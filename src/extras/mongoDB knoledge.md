MongoDB

**Formato 1**

Una fecha grabada como String "Thu Dec 29 2016 00:57:58 GMT-0300"


	@DateTimeFormat(iso=ISO.DATE)	
	private Date fechaVisita;
	

	@DateTimeFormat(iso=ISO.DATE_TIME)
	private Date fecha;


La parsea asi          fecha	1497877129000
 
 
 
**Formato 2**

Una fecha grabada como Date
	"fecha": ISODate("2017-07-13T08:56:26.000Z"), 
