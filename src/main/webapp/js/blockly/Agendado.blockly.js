window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Agendado = window.blockly.js.blockly.Agendado || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Agendado.fa_C3_A7a_algo = function() {

	var item;
	this.cronapi.screen.notify('success', 'eds');
	window.alert('testando cliente');
}

/**
 * Agendado
 */
window.blockly.js.blockly.Agendado.Executar = function() {

	var item;
	this.cronapi.util.scheduleExecution(function() {
		this.blockly.js.blockly.Agendado.fa_C3_A7a_algo();
	}.bind(this), 0, 0, 'seconds');
}
