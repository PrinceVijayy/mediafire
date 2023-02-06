import React from "react";
import HeaderComponent from "../components/HeaderComponent";
import "../sass/HomePage.scss";
import "../sass/Upgrade.scss";

const PlanUpgrade = () => {
  return (
    <div className="upgrade">
      <div className="home-component">
        <HeaderComponent />
      </div>
      <div className="text-center" style={{ padding: " 100px 10px 10px 10px" }}>
        All product <span className="text-danger fw-bold">30% - 50% OFF</span>
      </div>
      <div className=" text-center fs-2 pt-4 pb-5">
        Choose your plan to get started
      </div>
      <div className="container">
        <div class="row row-cols-1 row-cols-md-3 g-4">
          <div class="col">
            {/* ---------------------------c1--------------------------------- */}
            <div class="card h-100" width="28 rem">
              <div className="ribbon-style">
                <div class="ribbon red">
                  <span>your data</span>
                </div>
              </div>
              <div class="card-body">
                <h5 class="card-title planTitle text-center">Pro</h5>
                <p>1 User</p>
                <p>1 TB (1000 GB)</p>
                <p>$8.33/month</p>
                <p> $5.83/month</p>
                <p>billed annually or $6.99 month-to-month</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">Last updated 3 mins ago</small>
              </div>
            </div>
          </div>
          {/* ---------------------------c2--------------------------------- */}
          <div class="col">
            <div class="card h-100">
              <div className="ribbon-style">
                <div class="ribbon red">
                  <span>30% OFF</span>
                </div>
              </div>
              <div class="card-body">
                <h5 class="card-title  planTitle text-center">Business</h5>
                <p>100 User</p>
                <p>2 TB (1000 GB)</p>
                <p>$100.00/month</p>
                <p>$50.00/month</p>
                <p>billed monthly</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">Last updated 3 mins ago</small>
              </div>
            </div>
          </div>
          {/* ---------------------------c3--------------------------------- */}
          <div class="col">
            <div class="card h-100">
              <div className="ribbon-style">
                <div class="ribbon red">
                  <span>50% OFF</span>
                </div>
              </div>
              <div class="card-body">
                <h5 class="card-title  planTitle text-center">Basic</h5>
                <p>10 GB</p>
              </div>
              <div class="card-footer">
                <small class="text-muted">Last updated 3 mins ago</small>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default PlanUpgrade;
