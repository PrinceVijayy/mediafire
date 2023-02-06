import React from 'react'
import { useNavigate } from 'react-router-dom'

const HeaderComponent = () => {
    const navigate=useNavigate();
    const handleSignIn =()=>{

    }
    const handleSignUp=()=>{
        navigate("/upgrade")
    }
  return (
    <div>
      <header className="header nav-bar-style">
        <nav>
          <ul>
            <h1>Attendance tracker</h1>
          </ul>
        </nav>
        <div className="nav-btn-style">
          <button onClick={handleSignIn} className="btn btn-primary me-3">Sign In</button>
          <button onClick={handleSignUp} className="btn btn-primary me-3">Sign Up</button>
        </div>
      </header>
    </div>
  )
}

export default HeaderComponent
