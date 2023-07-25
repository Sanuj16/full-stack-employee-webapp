import React, { useState } from 'react'
import EmployeeService from '../services/EmployeeService';
import { Navigate, useNavigate } from 'react-router-dom';

const AddEmployee = () => {


    const [employee, setEmployee] = useState({
        id:"",
        name:"",
        designation:"",
        salary:"",
    });

    const handleChange = (e) => {
        const value = e.target.value;
        setEmployee({...employee, [e.target.name]: value});
    }

    const saveEmployee = (e) => {
        //e.preventDefault();
        EmployeeService.saveEmployee(employee)
        .then((response) => {
            console.log(response);
            setEmployee({
                id:"",
                name:"",
                designation:"",
                salary:"",
            })
        })
        .catch((error) => {
            console.log(error);
        })
    }

  return (
    <div class="mx-auto max-w-2xl items-center font-sans">
      <div>
        <div className="px-3 py-6 text-center bg-green-600 tracking-tighter text-white font-thin">
          Add New Employee
        </div>
        <div class="bg-slate-200">
          <label className="block w-full px-4 pt-2 font-extralight ">ID</label>
          <input
            class="px-4 py-2 w-3/4 rounded-md bg-green-50 mx-4 my-2"
            name="id"
            type="text"
            value={employee.id}
            onChange={(e) => handleChange(e)}
          ></input>
        </div>
        <div class="bg-slate-200">
          <label className="block w-full px-4 pt-2 font-extralight ">
            Name 
          </label>
          <input
            class="px-4 py-2 w-3/4 rounded-md bg-green-50 mx-4 my-2"
            type="text"
            name='name'
            value={employee.name}
            onChange={(e) => handleChange(e)}
          ></input>
        </div>
        <div class="bg-slate-200">
          <label className="block w-full px-4 pt-2 font-extralight ">
            Designation 
          </label>
          <input
            class="px-4 py-2 w-3/4 rounded-md bg-green-100 mx-4 my-2"
            type="text"
            name='designation'
            value={employee.designation}
            onChange={(e) => handleChange(e)}
          ></input>
        </div>
        <div class="bg-slate-200 pb-4">
          <label className="block w-full px-4 pt-2 font-extralight ">
            Salary 
          </label>
          <input
            class="px-4 py-2 w-3/4 rounded-md bg-green-100 mx-4 my-2"
            type="text"
            name='salary'
            value={employee.salary}
            onChange={(e) => handleChange(e)}
          ></input>
        </div>
        <div class="bg-slate-200 p-4 rounded-b-lg">
            <button class="rounded-lg bg-green-400 px-4 py-2 hover:bg-green-600"
            onClick={saveEmployee}
            >Submit</button>
        </div>
      </div>
    </div>
  );
};

export default AddEmployee;