import axios from 'axios'

import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'

export default function AgregarEmpleado() {
  
    let navegacion = useNavigate();
  const [empleado,setEmpleado] = useState({
    nombre:"",
    departamento:"",
    sueldo:""
  })
  
const {nombre,departamento,sueldo} = empleado

const oninputChange = (e) =>{
    //spread ... (para expandir los objetos)
setEmpleado({...empleado, [e.target.name]:e.target.value})
}

const onSubmit = async(e)=>{

    e.preventDefault();
    const urlBase = "http://localhost:8080/rh-app/empleados";
    await axios.post(urlBase, empleado);
    //redirigimos a la pagina de inicio
navegacion('/');


}


    return (
    <div className='contaimner'>

<div className="container text-center " style={{margin:"30px"}}>
    <h3>Agregar empleado</h3>

</div>

        
<form onSubmit={(e)=> onSubmit(e)}>
  <div className="mb-3">
    <label htmlFor="nombre" className="form-label">Nombre</label>
    <input type="text" className="form-control" id="nombre" name='nombre' required={true}
    value={nombre} onChange={(e)=>oninputChange(e)}/>
    
  </div>
  <div className="mb-3">
    <label htmlFor="departamento" className="form-label">Departamento</label>
    <input type="text" className="form-control" id="departamento" name='departamento'
    value={departamento} onChange={(e)=>oninputChange(e)}/>
  </div>
  <div className="mb-3">
    <label htmlFor="sueldo" className="form-label">Sueldo</label>
    <input type="number"  step="any"  className="form-control" id="sueldo" name='sueldo'
    value={sueldo} onChange={(e)=>oninputChange(e)}/>
  </div>

<div className='text-center'></div>

  <button type="submit" className="btn btn-primary btn-sm me-3">Agregar</button>
  <a href='/' className='btn btn-danger btn-sm'>Regresar</a>
</form>




    </div>
  )
}
