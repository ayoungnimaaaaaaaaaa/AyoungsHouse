//
//  FNMRealTimeRankTableViewCell.swift
//  FindingNemo
//
//  Created by SeokWoo Lee on 2017. 8. 21..
//  Copyright © 2017년 SeokWoo Lee. All rights reserved.
//

import UIKit

class FNMRealTimeRankTableViewCell: UITableViewCell {
    @IBOutlet weak var thumbnailImageView: UIImageView!
    @IBOutlet weak var nameLabel: UILabel!
    @IBOutlet weak var gradeLabel: UILabel!
    @IBOutlet weak var kindLabel: UILabel!

    override func awakeFromNib() {
        super.awakeFromNib()
    }

    override func setSelected(_ selected: Bool, animated: Bool) {
        super.setSelected(selected, animated: animated)
    }
    
}
