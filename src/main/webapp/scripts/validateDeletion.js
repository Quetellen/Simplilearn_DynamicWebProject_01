/**
 * Confirmacao de exclusao
 */

function confirm(b_id) {
	let answer = confirm("Delete this batch?")
	if (answer === true) {
		//alert(b_id)
		window.location.href = "delete?b_id=" + b_id
	}

}