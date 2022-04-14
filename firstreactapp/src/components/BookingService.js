import React, { useState } from 'react'
import { Link, useLocation, useNavigate, useParams } from "react-router-dom";


export default function BookingService(props)
{   
    
    
    const {id} =useParams();

   
    let customerid = JSON.parse(localStorage.getItem("loggedinuser")).customerID;


    const [state,setState]=useState({
       customerID:0,
       ownerID:0,
       vehicleID:0,
       empid:0,
       orderstatus:"",
       servicing_date:"",
       serviceid:[]
       
        
    });

    const handleInput=(ev)=>{
        setState((state)=>({
            ...state,
            [ev.target.name]:ev.target.value

        }));
        console.log(ev.target.value);
    }
    
    const  submitData=(e)=>{
        e.preventDefault();
        const reqOptions = {
            method: "POST",
            headers: {
                'Content-Type':'application/json'
            },
            body: JSON.stringify({
                customerID:customerid,
                ownerID:id,
                vehicleID:state.vehicleID,
                servicing_date:state.servicing_date,
                service_id:state.serviceid
            })
        }
              
    fetch("http://localhost:8080/placeorder",reqOptions)
    .then(resp=> resp.json())
    .then(data=> { console.log(data);

    });
}
  
   
    const[vehicles,setVehicles]=useState({
        allvehicles : []
        
     });

     
    const[customers,setCustomer]=useState({
        allcustomer : []
        
     });


     const[services,setServices]=useState({
        allservices : []
        
     });


   

     React.useEffect(() => {
        fetch("http://localhost:8080/getvehicle/"+customerid)
        .then(resp => resp.json())
        //.then(data => alert(JSON.stringify(data)))
        .then(data => setVehicles({allvehicles : data}))
        //alert(JSON.stringify(cities.allcities))

        alert(customerid);


       fetch("http://localhost:8080/getservicedetails/"+id)
        .then(resp => resp.json())
        //.then(data => alert(JSON.stringify(data)))
        .then(data => setServices({allservices : data}))
        //alert(JSON.stringify(cities.allcities))

     alert(id);


       }, []);

       

     return (
        <div className='container-fluid'> 
        <div className="app-wrapper">
            
                <h2 className='title'> Book Appointment </h2>

                <form>

                <div className="label">
             <h4 className='sub'> Select Vehicle</h4>
              </div> 
              <div className="qid">
              <select name="vehicleID" onChange={handleInput}>
              <option> Select here </option>
                            {                                        
                                        vehicles.allvehicles.map((s) => {
                                            return(<option key={s.vehicleID} value={s.vehicleID}> {s.vehiclenumber} </option>)
                                        })
                            }
                            </select>
                                

             </div> 

             <div className="label">
                   <h4 className='sub'> Select Services  </h4>
                   </div> 
                  <div className="serviceid">
                  <select name="serviceid"  onChange={handleInput}  multiple size="3">
                  <option> Select here </option>
                                    { 
                                        
                                        services.allservices.map((s) => {
                                            return(<option key={s.service.service_id} value={s.service.service_id}> {s.service.service_name} </option>)
                                        })
                                    }
                  </select> 
             </div>

             
           
             <div className="label">
             <h4 className='sub'> Enter Servicing Date </h4>
              </div> 
              <div className="sdate">
                 <input className='input' type="Date"  name="servicing_date"  onChange={handleInput} value={state.servicing_date} />
             </div>
             
             <input type="submit" name="submit"  onClick={submitData} value="submit" className="btn btn-primary" ></input>

       </form>
       


         </div>
         </div>
   
 );

 }