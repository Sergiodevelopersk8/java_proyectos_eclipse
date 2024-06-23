import React from 'react'
import { Link } from 'react-router-dom'

export default function Navegacion() {
  return (
    <div className="Container">
        <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
  <div className="container-fluid">
    <a className="navbar-brand" href="/">Sistema de Recursos Humanos</a>
    <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" 
    aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span className="navbar-toggler-icon"></span>
    </button>
    <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div className="navbar-nav">
        <li className='nav-item'>
            <a className="nav-link active" aria-current="page" href="/">Inicio</a>
            </li>
        <li className='nav-item'>
            <Link className="nav-link" to="/agregar">Agregar Empleado</Link>
            </li>
      </div>
    </div>
  </div>
</nav>
    </div>
  )
}
