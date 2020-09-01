class User {
    nombre = '';
    email = '';
    password = '';

    constructor(user){
        if(user){
            this.nombre = user.nombre;
            this.email = user.email;
            this.password = user.password;
        }
    }
}
export default User;