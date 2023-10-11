/**
 * Validating the forms
 */

 function validate(){
	 //alert('test')
	 let b_id = frmBatch.b_id.value
	 let name = frmBatch.name.value
	 let startTime = frmBatch.startTime.value
	 let endTime = frmBatch.endTime.value
	 let shift = frmBatch.shift.value
	 if (b_id === ""){
		 alert('Please, give a ID to your Batch')
		 frmBatch.name.focus()
		 return false
	 } else if(name === ""){
		 alert('Please, give a name to your Batch')
		 frmBatch.name.focus()
		 return false
	 }else if(startTime === "" || endTime === ""){
		 alert('Please, set a start and end time for your Batch')
		 frmBatch.name.focus()
		 return false
	 }else if(shift === ""){
		 alert('Please, define if is AM or PM')
		 frmBatch.name.focus()
		 return false
	 }else {
		 document.forms["frmBatch"].submit()
	 }
 }