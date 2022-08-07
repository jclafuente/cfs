// Call the dataTables jQuery plugin
$(document).ready(function () {
    loadUsers();
    $('#usuarios').DataTable();
});

async function loadUsers() {

    const request = await fetch('usuarios', {
        method: 'GET',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }
    });
    const usuarios = await request.json();


    let usersHTML = '';
    for (let usuario of usuarios) {
        let userHTML = '<tr>\n' +
            '    <td>' + usuario.id + '</td>\n' +
            '    <td>' + usuario.nombre + ' ' + usuario.apellido + '</td>\n' +
            '    <td>' + usuario.telefono + '</td>\n' +
            '    <td>' + usuario.mail + '</td>\n' +
            '    <td>' +
            '        <a href="#" class="btn btn-danger btn-circle btn-sm">\n' +
            '            <i class="fas fa-trash"></i>\n' +
            '        </a>' +
            '    </td>' +
            '</tr>';
        usersHTML += userHTML;
    }


    document.querySelector('#usuarios tbody').outerHTML = usersHTML;


}